'use client';
import { useState } from 'react';
import { useImmer } from 'use-immer';

let nextId = 3;
const initialList = [
  { id: 0, title: 'Big Bellies', seen: false },
  { id: 1, title: 'Lunar Landscape', seen: false },
  { id: 2, title: 'Terracotta Army', seen: true },
];

export default function BucketList() {
  const [myList, setMyList] = useState(initialList);
  const [yourList, updateYourList] = useImmer(initialList );

  function handleToggleMyList(artworkId, nextSeen) {
    const myNextList = myList.map(a => {
      if(a.id === artworkId) {
        return {...a, seen: nextSeen};
      }else {
        return {...a};
      }
    } );

    setMyList(myNextList);
  };
  function handleToggleYourList(artworkId, nextSeen) {
    updateYourList(draft => {
      const artWork = draft.find(a => a.id === artworkId);
      artWork.seen = nextSeen;

  });
  };

  return (
    <>
      <h1>Art Bucket List</h1>
      <h2>My list of art to see:</h2>
      <ItemList
        artworks={myList}
        onToggle={handleToggleMyList} />
      <h2>Your list of art to see:</h2>
      <ItemList
        artworks={yourList}
        onToggle={handleToggleYourList} />
    </>
  );
}

function ItemList({ artworks, onToggle }) {
  return (
    <ul>
      {artworks.map(artwork => (
        <li key={artwork.id}>
          <label>
            <input type="checkbox" checked={artwork.seen} onChange={e => {onToggle(artwork.id, e.target.checked);}} />
            {artwork.title}
          </label>
        </li>
      ))}
    </ul>
  );
}
