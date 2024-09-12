import React from 'react';
const StoryTray = ({people}) => {
  
  //const newList = people.slice();
  people.push({
    id: 'create',
    name: 'Create Story',
  });
  
  return (
    <ul>
      {people.map((person) => (
        <li key={person.id}>{person.name}</li>
      ))}
    </ul>
  );

};

export default StoryTray;
