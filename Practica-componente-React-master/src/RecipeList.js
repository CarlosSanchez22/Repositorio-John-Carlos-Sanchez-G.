import React from 'react';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import RecipeCard from './RecipeCard';

function RecipeList({ recipes }) {
  return (
    <Row>
      {recipes.map((recipe, index) => (
        <Col key={index} xs={12} md={6} lg={4}>
          <RecipeCard recipe={recipe} />
        </Col>
      ))}
    </Row>
  );
}

export default RecipeList;
