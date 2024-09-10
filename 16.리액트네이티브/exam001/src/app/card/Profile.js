export default function Profile ({children, title}) {
  return (
    <div>
      <div className="card">
        <div className="card-content">
        <h1>{title}</h1>
          {children}
        </div>
      </div>
    </div>
  );
};
