import React from 'react';
import { IoMdRadioButtonOff } from "react-icons/io";
import { IoMdRadioButtonOn } from "react-icons/io";

const TodoForm = ({onSubmit, onChange}) => {
    return <form autoComplete='off' onSubmit={onSubmit}>
        <dl>
            <dt>할일</dt>
        </dl>
        <dd>
            <input type="text" name="title" onChange={onChange} />
        </dd>
        <dl>
            <dt>내용</dt>
            <dd>
                <textarea name="content" onChange={onChange}></textarea>
            </dd>
        </dl>
        <dl>
            <dt>완료여부</dt>
            <dd>
                <span>
                    <IoMdRadioButtonOff/>
                    완료
                </span>
                <span>
                    <IoMdRadioButtonOn/>
                    미완료
                </span>
            </dd>
        </dl>
        <button type="submit">할일 등록</button>
    </form>
};
export default TodoForm;