const BoardView = ({params, searchParams}) => {
  //console.log("props", props);
  const { seq } = params;
  const { aaa } = searchParams;
  return (
    <>
      <h1>게시글 보기 {seq}</h1>
      <h1>게시글 보기 {aaa}</h1>
    </>
  );
};
export default BoardView;
