//import Panel from './Panel.js';
import { getImageUrl } from './utils.js';


export default function Profile({ person }) {
  //let currentPerson;

  //currentPerson = person;
  console.log(person);
  return (
    <>
      
      <Header person={person}/>
      <Avatar person={person}/>
    </>
  )
}

function Header({person}) {
  return <h1>{person.name}</h1>;
}

function Avatar({person}) {
  return (
    <img
      className="avatar"
      src={getImageUrl(person)}
      alt={person.name}
      width={50}
      height={50}
    />
  );
}