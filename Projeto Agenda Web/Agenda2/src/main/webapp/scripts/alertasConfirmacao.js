document.readyState(cadastrado(resposta));


 function confirmar(id){
	 let resposta = confirm("Confirmar a exclusão contato?");
	 if(resposta === true){
		 //manda o comando para o servlet direcionar para o delet
		 window.location.href = "delete?id=" + id;
	 }
 }
 