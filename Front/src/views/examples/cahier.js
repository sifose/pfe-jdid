import {

  Card,
  CardHeader,  
  Table,
  Container,
  Row,
} from "reactstrap";
import  {useEffect, useState } from 'react';
// core components
import Header from "components/Headers/Header.js";



export default function Cahier()  {

  const[cahiers,setCahiers]=useState([])
 
  
  useEffect(()=>{
     fetch("http://localhost:8080/api/cahiers",{
      method: "Get",
      headers: {
        "content-type": "application/json",
        Authorization: "Bearer" + localStorage.getItem('token')
  }})
    .then(res=>res.json())
    .then((result)=>{
      setCahiers(result);
      
    }
  )
  },[])
  return (
    <>
      <Header />
      
      <Container className="mt--7" fluid>
        {/* Table */}
        <Row>
          <div className="col">
            <Card className="shadow">
              <CardHeader className="border-0">
                <h3 className="mb-0">Contenu des cahiers de texte</h3>
              </CardHeader>
              <Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">Classe</th>
                    <th scope="col">Date de saisie</th>
                    <th scope="col">Titre</th>
                    <th scope="col">Sujet</th>
                  </tr>
                </thead>
                <tbody>
                {cahiers.map(cahier=> 
                <tr key={cahier.idEns}>
                  <td>{cahier.codeCl}</td>
                  <td>{cahier.dateSaisie}</td>
                  <td>{cahier.titre}</td>
                  <td>{cahier.sujet}</td>
                  </tr>
               
               )}
                </tbody>
              </Table>
              </Card>
          </div>
        </Row>
      </Container>
    </>
  );
};

