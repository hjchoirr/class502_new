'use client';
export default function Toolbar() {
  return (
    <div
      className="Toolbar" onClickCapture={() => {}} 
      onClick={() => {
        alert('You clicked on the toolbar!');
      }}
    >
      <button onClick={(e) => {
        alert('Playing!');
        e.stopPropagation();
        }}>Play Movie</button>
      <button onClick={() => alert('Uploading!')}>Upload Image</button>
    </div>
  );
}
