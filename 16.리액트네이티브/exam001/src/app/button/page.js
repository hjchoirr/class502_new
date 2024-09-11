
'use client';
import Toolbar from "./Toolbar";

const ButtonPage = () => {
  return (
    <Toolbar
      onPlayMovie={()=> alert("Play Movie!!")}
      onUploadImage={()=>alert("Upload Image")}
    />
  );
};
export default ButtonPage;