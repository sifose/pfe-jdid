
import React, { Component, useState, useEffect } from 'react';
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  FormGroup,
  Form,
  Input,
  Table,
  Container,
  Row,
  Col,
} from "reactstrap";


import Header from "components/Headers/Header.js";
import { event } from 'jquery';




export default function Absence()  {

  const [datastudent, setDataStudent] = useState([]);
  const [datamodule, setDatamodule] = useState([]);
  const [dataclasse, setDataclasse] = useState([]);
  const [dataenseignant, setDataenseignant] = useState([]);
  const [markallstudentspresent, setMarkallstudentspresent]= useState(true);
  const [markallstudentsabsent, setMarkallstudentsabsent]= useState(false);
  const [classe, setClasse] = useState('');
  const [module, setModule] = useState('');

  /*constructor() {
    super();
    const [dataStudent, setDataStudent] = useState([]);
    this.state = {
      dataclasse: [],
      datamodule: [],
      datastudent:[],
    };
  } //end constructor*/

  function togglemarkstudentspresent(ev){
    let value = ev.target.checked;
    setMarkallstudentspresent(value)
    setMarkallstudentsabsent(!value)
    console.log(ev.target.value)
    console.log(markallstudentspresent)
  }
  function togglemarkstudentsabsent(ev){
    let value = ev.target.checked;
    setMarkallstudentsabsent(value)
    setMarkallstudentspresent(!value)
  }

  function submitAbsence(e){
    e.preventDefault()
    //let enseignant = dataenseignant
    //let classe = dataclasse
    //let module = datamodule
    let absentStudents = [];
    datastudent.forEach((student) => {
      console.log(student)
      console.log(e.target[student.idEt].value)
      if(e.target[student.idEt].value == 'true'){
        console.log('HERE')
        absentStudents.push(student.idEt)
        
      }
    })
    console.log(absentStudents)
   absentStudents.forEach((absentstudent) => {
    const absences = {
      espEtudiant: {idEt : absentstudent},
      codeModule: module,
      codeCl: classe,
      anneeDeb : new Date().getFullYear(),
      dateSeance : new Date(),
      numSeance : 1
    }
    fetch("http://localhost:8080/api/absences",{
      method:"POST",
      headers:{"Content-Type":"application/json",
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
    }
    ,
      body:JSON.stringify(absences)
  }).then(()=>{
    console.log("New absence added")
    console.log(absences)
  })
   })
   
  
  }

  function codeClValueChanged(ev) {
    console.log('in code cl changed')
    console.log(ev.target.value)
    setClasse(ev.target.value);
    fetch(`http://localhost:8080/api/etudiants/classe/${ev.target.value}`, {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
    })
      .then(async results => {
        let jsonResults = await results.json()
        setDataStudent(jsonResults)
      })
      /*.then(datastudent => setDataStudent(datastudent)
      .then(()=> {console.log(datastudent)})
      )*/
  }

  function RenderStudentDataTable({datastudent}){
    if(datastudent.length !== 0) return <div>
      
      <span>Etablir Par défault</span>

     
      <div class="checkboxes">
    <label><Input type="checkbox" defaultChecked={markallstudentspresent} onChange={togglemarkstudentspresent} ></Input> <span>Présence</span> </label>
    <label><Input type="checkbox" defaultChecked={markallstudentsabsent} onChange={togglemarkstudentsabsent } ></Input> <span>Absence</span> </label>
  </div>
<Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Prénom</th>
                    <th scope="col">Présence</th>
                    <th scope="col">Absence</th>
                    <th scope="col">Justification</th>


                    
                  </tr>
                </thead>
                <tbody>
                {datastudent.map(cahier=> 
                <tr key={cahier.idEt}>
                  <td>{cahier.idEt}</td>
                  <td>{cahier.nomEt}</td>
                  <td>{cahier.pnomEt}</td>
                  <td><Input type={'radio'} value={false} name={cahier.idEt} defaultChecked ={markallstudentspresent}></Input></td>
                  <td><Input type={'radio'} value={true} name={cahier.idEt} defaultChecked ={markallstudentsabsent}></Input></td>
                  <td><Input type={'text'}></Input></td>
                  </tr>
               
               )}
                </tbody>
              </Table>



    </div>
    else return <div>there is no data student</div>
  }

  useEffect(()=>{
    fetch('http://localhost:8080/api/modules', {
      method: 'GET',
      headers: {
      'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      /*body: JSON.stringify({
          username: '{userName}',
          password: '{password}'
      })*/
    }) /*end fetch */
      .then(results => results.json())
      .then(datamodule => setDatamodule(datamodule)

      )

      fetch('http://localhost:8080/api/enseignants', {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      /*body: JSON.stringify({
          username: '{userName}',
          password: '{password}'
      })*/
    }) /*end fetch */
      .then(results => results.json())
      .then(dataenseignant => setDataenseignant(dataenseignant)

      )

    fetch('http://localhost:8080/api/classes', {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      /*body: JSON.stringify({
          username: '{userName}',
          password: '{password}'
      })*/
    }) /*end fetch */
      .then(results => results.json())
      .then(dataclasse => setDataclasse(dataclasse))
  },[])


  /*componentWillMount() {
    fetch('http://localhost:8080/api/modules', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      
    }) 
      .then(results => results.json())
      .then(datamodule => this.setState({ datamodule: datamodule })

      )

    fetch('http://localhost:8080/api/classes', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
      
    }) 
      .then(results => results.json())
      .then(dataclasse => this.setState({ dataclasse: dataclasse }))

  }*/
 

    return (

      <>
        <Header />
        <Form onSubmit={submitAbsence}>
          <div className="pl-lg-4">
          <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Enseignant
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id="idEns"
                    placeholder="Code de la classe"
                    type="select"
                    
                  >
                    {dataenseignant.map((option) => (
                      <option value={option.idEns}>{option.nomEns}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col>
            </Row>
            <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Classe
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id="codeCl"
                    placeholder="Code de la classe"
                    type="select"
                    onChange={codeClValueChanged}

                  >
                    {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl}</option>
                    ))}
                  </Input>
                </FormGroup>
              </Col>
            </Row>
            <Row>
              <Col lg="6">
                <FormGroup>
                  <label
                    className="form-control-label"
                    htmlFor="input-username"
                  >
                    Module
                  </label>

                  <Input
                    className="form-control-alternative"
                    defaultValue="lucky.jesse"
                    id="codeModule"
                    placeholder="Username"
                    type="select"
                    onChange={(e)=>setModule(e.target.value)}

                  >
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation}</option>
                    ))}

                  </Input>
                </FormGroup>
              </Col>
            </Row>
            <Button type='submit'>Enregistrer</Button>
          </div>
        
        <RenderStudentDataTable datastudent={datastudent}></RenderStudentDataTable>
        </Form>
          
      </>
    );
}










