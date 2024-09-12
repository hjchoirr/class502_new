import Profile from './Profile';

const PageProfile = () => {
  return (
    <>
      <Profile
        person={{
          imageId: 'lrWQx8l',
          name: 'Subrahmanyan Chandrasekhar',
        }}
      />
      <Profile
        person={{
          imageId: 'MK3eW3A',
          name: 'Creola Katherine Johnson',
        }}
      />
    </>
  );
};
export default PageProfile;
