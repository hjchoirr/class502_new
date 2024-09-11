import { recipes } from './data.js';

const ListPage = () => {
  let newStr = "";

  const items = recipes.map(recipe => {
    
    console.log( recipe );
      
  });

  return (
    {items}
  );
};


export default ListPage;