function Drink({ name }) {
  let plant, content, age;
  if (name === 'tea') {
    plant = 'leaf';
    content = '15–70 mg/cup';
    age = '4,000+ years';
  } else {
    plant = 'bean';
    content = '80–185 mg/cup';
    age = '1,000+ years';
  }

  return (
    <section>
      <h1>{name}</h1>
      <dl>
        <dt>Part of plant</dt>
        <dd>{plant}</dd>
        <dt>Caffeine content</dt>
        <dd>{content}</dd>
        <dt>Age</dt>
        <dd>{age}</dd>
      </dl>
    </section>
  );
}

export default function DrinkList() {
  return (
    <div>
      <Drink name="tea" />
      <Drink name="coffee" />
    </div>
  );
}
