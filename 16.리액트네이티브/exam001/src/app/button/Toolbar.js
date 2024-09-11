import Button from './Button';

const Toolbar = ({onPlayMovie, onUploadImage}) => {
  return (
    <>
    <Button onClick={onPlayMovie}>
        Play Movie
    </Button>
    <Button onClick={onUploadImage}>
      Upload Image
    </Button>
    </>
  );
};
export default Toolbar;