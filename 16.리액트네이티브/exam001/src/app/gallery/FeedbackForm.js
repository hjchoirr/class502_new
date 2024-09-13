'use client';
import { useState } from 'react';

const FeedbackForm = () => {

  const [isSent, setIsSent] = useState(false);


  // eslint-disable-next-line
  const [message, setMessage] = useState('');

  return (
    <>
    <form onSubmit={e => {
      e.preventDefault();
      alert(`Sending: "${message}"`);
      setIsSent(true);
    }}>
      <textarea
        placeholder="Message"
        value={message}
        onChange={e => setMessage(e.target.value)}
      />
      <br />
      <button type="submit">Send</button>
    </form>

    {isSent && <h1>Thank you!</h1>} 
    </>
  );
};

export default FeedbackForm;