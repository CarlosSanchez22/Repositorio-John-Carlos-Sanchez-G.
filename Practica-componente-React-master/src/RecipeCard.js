import React from 'react';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';

function RecipeCard({ recipe }) {
  return (
    <Card className="mb-4">
      <Card.Img variant="top" src={recipe.image} alt={recipe.name} />
      <Card.Body>
        <Card.Title>{recipe.name}</Card.Title>
        <Card.Text>{recipe.description}</Card.Text>
        <Button variant="primary">Ver</Button>
      </Card.Body>
    </Card>
  );
}

export default RecipeCard;
