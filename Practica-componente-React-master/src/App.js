import React from 'react';
import Container from 'react-bootstrap/Container';
import Header from './Header';
import RecipeList from './RecipeList';

const recipes = [
  {
    name: 'Beef Stroganoff',
    description: 'A classic Russian dish made with tender beef, onions, and mushrooms in a rich sour cream sauce.',
    image: 'https://www.allrecipes.com/thmb/mSWde3PHTu-fDkbvWBw0D1JlS8U=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/25202beef-stroganoff-iii-ddmfs-3x4-233-0f26fa477e9c446b970a32502468efc6.jpg'
  },
  {
    name: 'Chicken Parmesan',
    description: 'A delicious Italian-American dish made with breaded chicken, marinara sauce, and melted cheese.',
    image: 'https://assets.bonappetit.com/photos/5ea8f0df16738800085ad5d2/1:1/w_2560%2Cc_limit/Chicken-Parmesean-Recipe-Lede.jpg'
  },
  {
    name: 'Pork Fried Rice',
    description: 'A flavorful Chinese-inspired dish made with tender pork, rice, and mixed vegetables.',
    image: 'https://www.gimmesomeoven.com/wp-content/uploads/2012/11/pork-fried-rice-1.jpg'
  },
  {
    name: 'Fish Tacos',
    description: 'A popular Mexican dish made with crispy fish, tangy cabbage slaw, and a creamy sauce.',
    image: 'https://hips.hearstapps.com/hmg-prod/images/fish-tacos-index-64ca974954d47.jpg?crop=0.7503703703703705xw:1xh;center,top&resize=1200:*'
  },
];


function App() {
  return (
    <Container>
      <Header />
      <RecipeList recipes={recipes} />
    </Container>
  );
}

export default App;
