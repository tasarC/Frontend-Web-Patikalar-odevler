document.querySelector('#push').onclick = function(){
    if(document.querySelector('#newtask input').value.length == 0){
        alert("Lütfen alanı doldurunuz.")
    }

    else{
        document.querySelector('#list').innerHTML += `
            <div  class="task text-left">
                <span id="taskname">
                    ${document.querySelector('#newtask input').value}
                </span>
                <button class ="delete float-right btn btn-primary" >X <i class="fa fa-close"></i></button>
            </div>
        `;

        var current_tasks = document.querySelectorAll(".delete");
        for(var i=0; i<current_tasks.length; i++){
            current_tasks[i].onclick = function(){
                this.parentNode.remove();
            }
        }
    }
}