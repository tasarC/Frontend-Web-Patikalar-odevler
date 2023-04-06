import React, { useState, useEffect } from 'react'

//app.js componentinden kullanılmak üzere bazı bileşenler alındı
function Footer({ list, setList,onFilterBtnClicked }) {
    //bir state tanımlayarak list bileşenini state te atadık
    const [changeStyle, setChangeStyle] = useState(list);

    //ALL, ACTİVE ve Completed Butonları oluşturmak için bir liste oluşturuldu.    
    const buttonList = [
        {
            name: 'All',
            select: false
        },
        {
            name: 'Active',
            select: false
        },
        {
            name: 'Comleted',
            select: false
        },
    ]

    const [btnList, setBtnList] = useState(buttonList);

   
   
    useEffect(() => {
		const newStyle = {};
		btnList.forEach((data, i) => {
			newStyle[i] = data.select ? "select" : "";
		});
		setChangeStyle(newStyle);
	}, [btnList]);

    const handleCheck = (tiklananBtn,taskIndex) => {
        const newTasks = [...btnList];
        newTasks.forEach((data, i) => {
			if (i === taskIndex) {
			  data.select = false;
			} else {
			  data.select = true;
			}
		  });
        setBtnList(newTasks);
		onFilterBtnClicked(tiklananBtn.name);
    }
    
    //todo daki bütün listeyi silen fonksiyon
    const clear = () => {
        setList(list.filter(x => x.complated === false))
    }

    return (
        <div>
            <footer className="footer">
                <span className="todo-count">
                    <strong>{list.length} </strong>
                    items left
                </span>

                <ul className="filters">
                    {btnList.map((btn, i) => (
                        <li key={i} >
                            <a href="#/" className={changeStyle[i]}  onClick={()=> handleCheck(btn,i)}>{btn.name}</a>
                        </li>
                    ))}
                </ul>

                <button className="clear-completed" onClick={() => clear()}>
                    Clear completed
                </button>
            </footer>

        </div>
    )
}

export default Footer
