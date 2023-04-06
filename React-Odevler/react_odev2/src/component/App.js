import React, { useState, useEffect } from 'react'//gerekli kancaların(hook) eklenmesi
import Footer from './Footer'; 
import List from './List';

function App() {

    //todo ya eklenilecek  yeni veriler için bir state oluşturuldu. 
    const [newitem, setnewItem] = useState()

    const [filterList, updateFilter] = useState('All')

    
   //todo da varsayılan olarak oluşturulan liste state
    const [list, setList] = useState([
        {
            checkbox: true,
            name: 'Learn JavaScript',
        },
        {
            checkbox: false,
            name: 'Learn React',
        },
        {
            checkbox: false,
            name: 'Have a life!'
        }])

   // todo ya veri eklemek için oluşturulan fonksiyon
    const addItem = () => {
        
        if (!newitem) {
            alert("enter item")
            return
        }
        const item = {
            id: Math.floor(Math.random()*1000),
            value: newitem
        }
        setList([...list, item])//setList işlemi bir önceki değerlerle beraber yeni değerler eklemektedir.
        setnewItem("") // yeni liste verileri setnewItem fonksiyonu ile listeye eklenir.
    }

    //todo listesine veri girildiği zaman newitem değerinin tetiklenmesi
    useEffect(() => {
        setnewItem(newitem)
        //console.log(newTaskList,' *****')
    }, [newitem]);



    //todo listesindeki her bir veriyi silebilmek için oluşturulan fonksiyon
    const deleteSelected = (deleteValue) => {
        // varsayılan değerler items değerine atanır.
        let items = [...list]
        // items e atılan değerler listesi
        items.splice(deleteValue, 1);
        // splicedan sonra items 
        setList(items);
    }
    
    //listeleme işlemi içerisinfde filtreleme işlemi yaparak all active completed butonlarını checkbox ile aktif ve pasif yapma
    let filteredList =  list.filter((task) => {
        if (filterList === 'All') {
            return task;
        } else if (filterList === 'Active') {
            return task.checkbox === false;
        }else {
            return task.checkbox === true;
        }
    })

    //
    const onFilterBtnClicked = (filterBtn) => {
        updateFilter(filterBtn);
    }

    return (
        <div>
            <section className="todoapp">
                <header className="header">
                    <h1>To do List</h1>
                    <form>
                        <input
                            className="new-todo"
                            placeholder="What needs to be done?"
                            autoFocus
                            value={newitem}
                            onChange={e => setnewItem(e.target.value)} />
                        <button onClick={() => addItem()}></button>
                    </form>

                </header>

                <section className="main">
                    <input className="toggle-all" type="checkbox" />
                    <label htmlFor="toggle-all">
                        Mark all as complete
                    </label>

                    <List list={filteredList}  deleteSelected={deleteSelected} setList={setList} />

                </section>
                <Footer list={list} setList={setList} onFilterBtnClicked={onFilterBtnClicked} />

            </section>

            <footer className="info">
                <p>Click to edit a todo</p>
                <p>Created by <a href="https://d12n.me/">Cennet Taşar</a></p>
                <p>Part of <a href="http://todomvc.com">TodoMVC</a></p>
            </footer>

        </div>
    )
}

export default App
