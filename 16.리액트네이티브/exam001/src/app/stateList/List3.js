'use client';
import { useState } from 'react';
let nextId = 3;
let initialArtists = [
  { id: 0, name: 'Marta Colvin Andrade' },
  { id: 1, name: 'Lamidi Olonade Fakeye' },
  { id: 2, name: 'Louise Nevelson' },
];

export default function List() {
  const [name, setName] = useState('');
  const [artists, setArtists] = useState(initialArtists);

  const handleClick = () => {

    const newArtists = [
      ...artists.slice(0, 1),
      { id: nextId++, name: name },
      ...artists.slice(1)
    ];
    setArtists(newArtists);
    setName('');
  }
  const handleReverse = () => {
    const newArtists = [ ...artists ];
    newArtists.reverse();
    setArtists(newArtists);
  }

  return (
    <>
      <h1>Inspiring sculptors:</h1>
      <input type="text" value={name} name="name" onChange={(e) => setName(e.target.value)}></input>
      <button onClick={handleClick}>insert</button>
      <button onClick={handleReverse}>Reverse</button>
      <ul>
        {artists.map(artist => <li key={artist.id}>{artist.name}</li>)}
      </ul>
    </>
  );
}