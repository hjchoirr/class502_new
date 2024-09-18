import Form from './Form';

let statuses = [
  'empty',
  'typing',
  'submitting',
  'success',
  'error',
];

const Input = () => {
  return statuses.map(status => <Form status={status}/>);
}
export default Input;