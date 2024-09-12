'use client';
import Toolbar from './Toolbar';

const ButtonPage = () => {
  const m = 'Play Movie!!';
  const u = 'Upload Image';
  return (
    <Toolbar onPlayMovie={() => alert(m)} onUploadImage={() => alert(u)} />
  );
};
export default ButtonPage;
