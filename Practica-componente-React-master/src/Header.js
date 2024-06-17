import React from 'react';
import Navbar from 'react-bootstrap/Navbar';
import Form from 'react-bootstrap/Form';
import FormControl from 'react-bootstrap/FormControl';
import Button from 'react-bootstrap/Button';

function Header() {
  return (
    <Navbar bg="light" expand="lg" className="mb-4">
      <Navbar.Brand href="#">Recetas de cocina</Navbar.Brand>
      <Form inline className="ml-auto">
        <FormControl type="text" placeholder="Nombre de la receta" className="mr-sm-2" />
        <Button variant="outline-primary">Buscar</Button>
      </Form>
    </Navbar>
  );
}

export default Header;
