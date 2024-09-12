'use client';
import Clock from './Clock';
import React, { useState } from 'react';

const TestPage = () => {
  
  const [date, setDate] = useState(new Date());

  setDate(new Date());
  return <Clock time={date} />;
};
export default TestPage;
