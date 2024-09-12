const poem = {
    lines: [
      'I write, erase, rewrite',
      'Erase again, and then',
      'A poppy blooms.'
    ]
  };
  
  export default function Poem() {
    return (
      <article>
        {poem.lines.map((line, index) =>
            <p key={index}>
            {index != 0 ? <hr /> : null } 
            {line} 
          </p>
        )}
      </article>
    );
  }