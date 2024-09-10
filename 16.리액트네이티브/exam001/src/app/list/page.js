const List = () => {
  const people = [
    { id: 1, name: 'Creola Katherine Johnson', job: 'mathematician' },
    { id: 2, name: 'Mario José Molina-Pasquel Henríquez', job: 'chemist' },
    { id: 3, name: 'Mohammad Abdus Salam', job: 'physicist' },
    { id: 4, name: 'Percy Lavon Julian', job: 'chemist' },
    { id: 5, name: 'Subrahmanyan Chandrasekhar', job: 'astrophysicist' },
  ];

  const chemist = people.filter((person) => {return person.job === 'chemist'});
  console.log(chemist, chemist);
  return (

    <ul>
      {chemist.map((person) => {return <li key={person.id}>{person.job} {person.name}</li>})}
    </ul>
  );
};
export default List;
