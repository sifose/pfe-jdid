/*!

=========================================================
* Argon Dashboard React - v1.2.1
=========================================================

* Product Page: https://www.creative-tim.com/product/argon-dashboard-react
* Copyright 2021 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/argon-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import { Link } from "react-router-dom";
// reactstrap components
import {
  DropdownMenu,
  DropdownItem,
  UncontrolledDropdown,
  DropdownToggle,
  Form,
  FormGroup,
  InputGroupAddon,
  InputGroupText,
  Input,
  InputGroup,
  Navbar,
  Nav,
  Container,
  Media,
  ButtonGroup,
  Button,
} from "reactstrap";
import { useHistory } from 'react-router-dom';
import useToken from "components/useToken";

const AdminNavbar = (props) => {
  const history = useHistory();
  const { token, setToken } = useToken();
function logout(){
//
if(localStorage.getItem('token')){
  return localStorage.clear('token');
    
  }}

  return (
    <>
      <Navbar className="navbar-top navbar-dark" expand="md" id="navbar-main" color="red">
        <Container fluid>
          <Link
            className="h4 mb-0 text-white text-uppercase d-none d-lg-inline-block"
            to="/"
          >
            {props.brandText}
          </Link>
          <Form  className="navbar-search navbar-search-dark form-inline mr-3 d-none d-md-flex ml-lg-auto">
            <FormGroup className="mb-0">
              <InputGroup className="input-group-alternative">
                <InputGroupAddon addonType="prepend">
                  <InputGroupText>
                    <i className="fas fa-search" />
                  </InputGroupText>
                </InputGroupAddon>
                <Input placeholder="Search" type="text" />
              </InputGroup>
              <ButtonGroup>
                <Button onClick={logout()}>Déconnexion</Button>
              </ButtonGroup>
            </FormGroup>
          </Form>
        </Container>
      </Navbar>
    </>
  );
};

export default AdminNavbar;
