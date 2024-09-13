'use client';
import { useState } from 'react';
import { sculptureList } from './data.js';

const Gallery = () => {
  const [index, setIndex] = useState(0);
  const [showMore, setShowMore] = useState(true);

  const handleClickNext = () => {
    setIndex(index + 1);
  };
  const handleClickPrevious = () => {
    setIndex(index - 1);
  };
  const handleClickShow = () => {
    setShowMore(!showMore);
  };

  let sculpture = sculptureList[index];

  return (
    <>
      {index + 1 < sculptureList.length && (<button onClick={handleClickNext}>Next</button>)}
      {index + 1 > 1 && (<button onClick={handleClickPrevious}>Previous</button>)}

      <h2>
        <i>{sculpture.name} </i>
        by {sculpture.artist}
      </h2>
      <h3>
        ({index + 1} of {sculptureList.length})
      </h3>

      <img src={sculpture.url} alt={sculpture.alt} />

      <button onClick={handleClickShow}>
        {showMore ? 'Hide detail' : 'Show detail'}
      </button>
      {showMore && <p>{sculpture.description}</p>}
    </>
  );
};
export default Gallery;
