import Profile from './Profile';

const Card = () => {
    return (
        <>
    <Profile title="photo" >
          <img
            className="avatar"
            src="https://i.imgur.com/OKS67lhm.jpg"
            alt="Aklilu Lemma"
            width={70}
            height={70}
          />
    </Profile>
    <Profile title="About">
    <p>Aklilu Lemma was a distinguished Ethiopian scientist who discovered a natural treatment to schistosomiasis.</p>
    </Profile>
    </>
    );
    
};
export default Card;
