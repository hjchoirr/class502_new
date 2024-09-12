import Button from './Button';

const Toolbar = ({ onPlayMovie, onUploadImage }) => {
  //console.log(onPlayMovie);
  return (
    <>
      <Button onClick={onPlayMovie}>Play Movie</Button>
      <Button onClick={onUploadImage}>Upload Image</Button>
    </>
  );
};
export default Toolbar;
