const BoardView = ({ params, searchParams }) => {
  const { seq } = params;
  const { aaa } = searchParams;
  return (
    <>
      <h3> 게시글 보기 {seq}</h3>
      <h3> 게시글 보기 {aaa}</h3>
    </>
  );
};
export default BoardView;
