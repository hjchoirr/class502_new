export default function MessageBox({children}) {
    const messages = Array.isArray(children) ? children : [children]; //배열아니면 배열로
    return <>{messages && 
        messages.length > 0 && 
        messages.map((m) => <div key={m}>{m}</div>)}
    </>

}