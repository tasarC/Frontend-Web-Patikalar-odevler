let btncontainar = document.querySelector('.btn-container')
let section = document.querySelector('.section-center')

const categorys = menu.reduce((values,i)=>{
  if(!values.includes(i.category)){
    values.push(i.category)
  }
  return values;
},["All"])

const categoryslist = ()=>{
    btncontainar.innerHTML = categorys.map((category)=>{
        return `<button onclick ="changeMenu(this)" class="btn btn-outline-secondary btn-item"
        data-name=${category}>${category}</button>`;
    }).join("");
    
}
const changeMenu = (e) => {
    document.querySelectorAll(".btn").forEach(btn => {
                btn.classList.remove("active")
            })
            e.classList.add("active")
        
            const clickMenu = (e.dataset.name != "All") ? menu.filter(each => {
                if(each.category === e.dataset.name) {
                    return each
                }
            }) : menu
            listmenu(clickMenu)
    
}



const listmenu = (item) => {
    section.innerHTML = item.map((item) => {
      return `<div class="menu-items col-lg-6 col-sm-12">
              <img
                src=${item.img}
                alt=${item.title}
                class="photo"
              />
              <div class="menu-info">
                <div class="menu-title">
                  <h4>${item.title}</h4>
                  <h4 class="price">${item.price}</h4>
                </div>
                <div class="menu-text">
                  ${item.desc}
                </div>
              </div>
            </div>
      `;
    }).join("");
    
  };
listmenu(menu)
categoryslist()


