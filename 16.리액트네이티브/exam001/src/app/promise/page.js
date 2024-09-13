'use client';
import {async1,  async2, async3 } from './PromiseEx';

const PromisePage = () => {

    const start = 1;
    async1(start).then(async2).then(async3).then(result => {
        console.log(result);
    });

}
export default PromisePage;