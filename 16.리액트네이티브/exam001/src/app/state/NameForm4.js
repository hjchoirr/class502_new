'use client';
import   {useImmer} from 'use-immer';

export default function Form() {
  const [person, updatePerson] = useImmer({
    name: 'Niki de Saint Phalle',
    artwork: {
    title: 'Blue Nana',
    city: 'Hamburg',
    image: 'https://i.imgur.com/Sd1AgUOm.jpg',
    }
    });
  function handleCityChange(e) {

    updatePerson(draft => {
      draft.artwork.city = e.target.value;
    });
    
  }
  return (
    <>
      <label>
        person.name:
        <input name="name" value={person.name} onChange={handleCityChange} />
      </label>
      <label>
        person.artwork.title:
        <input name="title" value={person.artwork.title} onChange={handleCityChange} />
      </label>
      <label>
        person.artwork.city:
        <input name="city" value={person.artwork.city} onChange={handleCityChange} />
      </label>
      <p>
        {person.name}{' '}{person.artwork.title}{' '}({person.artwork.city})
      </p>
    </>
  );
}
