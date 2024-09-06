export const metadata = {
  title: 'Next.js 연습',
  description: '설명',
};

export default function RootLayout({ children }) {
  return (
    <html>
      <body>
        <header>
          <h1></h1>
        </header>
        <main>{children}</main>
        <footer>
          <h1></h1>
        </footer>
      </body>
    </html>
  );
}
