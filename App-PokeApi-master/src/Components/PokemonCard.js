import React from "react";
import { Button, Card, Col } from "react-bootstrap";
import defaultImage from "../default.png";

function PokemonGo({ name, brief, image }) {
  return (
    <Col md={3} style={{ marginBottom: "50px" }}>
      <Card style={{ width: "18rem", backgroundColor: "#ffff" }}>
        <Card.Img variant="top" src={image || defaultImage} />
        <Card.Body>
          <Card.Title>{name}</Card.Title>
          <Card.Text>{brief}</Card.Text>
          <Button variant="primary">Pokémon</Button>
        </Card.Body>
      </Card>
    </Col>
  );
}

export default PokemonGo;





