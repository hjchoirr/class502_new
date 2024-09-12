import { recipes } from './data.js';

const RecipeList = () => {
  return (
    <div>
      <h1>Recipes</h1>
      {recipes.map((recipe) => (
        <li key={recipe.id}>
          {recipe.name}
          <Ingre ingre={recipe.ingredients}/>
        </li>
      ))}
    </div>
  );
};
export default RecipeList;

const Ingre = ({ingre}) => {
  return(
    <ul>
    {ingre.map((s) => (
        <li key={s}>{s}</li>
      ))
    }
    </ul>
  );

};
export {Ingre};