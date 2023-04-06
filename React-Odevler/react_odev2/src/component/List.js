import React, { useEffect, useState } from 'react'

//app.js componentinden kullanılmak üzere bazı bileşenler alındı
function List({list,deleteSelected}) {

    //bir state tanımlayarak list bileşenini state te atadık
    const [newList, setNewList] = useState(list);
    const [changeStyle, setChangeStyle] = useState({});

    

    //newTakList bileşeninin listeye eklenen verilerin checbox değerine görre tetiklenmesi
    useEffect(() => {
        const newStyle = {};
        newList.forEach((data,i) => {
            newStyle[i] = data.checkbox ? "completed" : "";
        });
        setChangeStyle(newStyle);
    }, [newList]);

    const handleCheck = (value) => {
        const newItem = [...newList];
        newItem[value].checkbox = !newItem[value].checkbox;
        setNewList(newItem);
    }
    //todo listesin etkileşim halindeyken list değerinin tetiklenmesi
    useEffect(() => {
        setNewList(list)
    }, [list]);
    
    //listedeki herbir veri için silme fonksiyonu
    const deleteTask =(i)=>{
        deleteSelected(i);
    }

  return (
    <div>
            <section >
                <ul className="todo-list" >
                    {newList && newList.map((task, i) => (
                        <li key={i} className={changeStyle[i]}>
                            <div className='view' >
                                <input className='toggle' type="checkbox" checked={task.checkbox} onChange={() => handleCheck(i)} />
                                <label >{task.name}{task.value}</label>
                                <button className="destroy" onClick={()=> deleteTask(i, task.value)}></button>
                            </div>
                        </li>
                    ))}
                </ul>
            </section>
        </div>
  )
}

export default List
