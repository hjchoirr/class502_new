import Link from 'next/link';

export default function Home() {
  return (
    <>
      <h1>메인페이지</h1>
      <div>
        <a href="/member/join">회원가입</a>
      </div>
      <div>
        <h2>childenSR</h2>
        <Link href="/board/view/1">1번게시물</Link>
        <Link href="/board/view/2">2번게시물</Link>
      </div>
    </>
  );
}
