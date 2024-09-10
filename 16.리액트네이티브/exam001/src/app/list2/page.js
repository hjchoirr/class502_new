import { people } from './data.js';
import { getImageUrl } from './utils.js';

export default function List() {
  const chemistPeople = people.filter(
    (person) => person.profession === 'chemist',
  );
  const nonChemistPeople = people.filter(
    (person) => person.profession != 'chemist',
  );

  const listItems1 = chemistPeople.map((person) => (
    <li key={person.id}>
      <img src={getImageUrl(person)} alt={person.name} />
      <p>
        <b>{person.name}:</b>
        {' ' + person.profession + ' '}
        known for {person.accomplishment}
      </p>
    </li>
  ));

  const listItems2 = nonChemistPeople.map((person) => (
    <li key={person.id}>
      <img src={getImageUrl(person)} alt={person.name} />
      <p>
        <b>{person.name}:</b>
        {' ' + person.profession + ' '}
        known for {person.accomplishment}
      </p>
    </li>
  ));

  return (
    <article>
      <h1>chemist</h1>
      <ul>{listItems1}</ul>
      <h1>Not chemist</h1>
      <ul>{listItems2}</ul>
    </article>
  );
}
