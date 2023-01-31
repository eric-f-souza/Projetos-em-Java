/**
 * validação para as solicitações 
 */

 function validar(){
	 let nome = frmNovoContato.nome.value;
	 let sobrenome = frmNovoContato.sobrenome.value;
	 let dataNascimento = frmNovoContato.dataNascimento.value;
	 let telefone01 = frmNovoContato.telefone01.value;
	 let telefone02 = frmNovoContato.telefone02.value;
	 let telefone03 = frmNovoContato.telefone03.value;
	 let parentesco = frmNovoContato.parentesco.value;
	 let tamanhoTelefone1 = frmNovoContato.telefone01.value.length;
	 let tamanhoTelefone2 = frmNovoContato.telefone02.value.length;
	 let tamanhoTelefone3 = frmNovoContato.telefone03.value.length;
	 
	 if(nome === ""){
		 alert("Campo Nome deve ser preenchido")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(sobrenome === ""){
		 alert("Campo Sobrenome deve ser preenchido")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(dataNascimento === ""){
		 alert("Campo Data de Nascimento deve ser preenchido")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(telefone01 === ""){
		 alert("Campo Numero Telefone deve ser preenchido")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(tamanhoTelefone1 <= 10){
		 alert("Campo Numero Telefone deve ter pelomenos 11 caracteres" )
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(isNaN(telefone01)){
		 alert("Telefone deve ter somente numeros")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(tamanhoTelefone2 != "" && tamanhoTelefone2 >= 1 && tamanhoTelefone2 <= 10){
		 alert("Campo Numero Telefone adicional 2 deve ter pelomenos 11 caracteres")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(tamanhoTelefone2 != "" && isNaN(telefone02)){
		 alert("Campo Numero Telefone adicional 2 deve ter somente numeros")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(tamanhoTelefone3 != "" && tamanhoTelefone3 >= 1 && tamanhoTelefone3 <= 10 ){
		 alert("Campo Numero Telefone adicional 3 deve ter pelomenos 11 caracteres")
		 frmNovoContato.nome.focus();
		 return false;
	 }else if(tamanhoTelefone3 != "" && isNaN(telefone03)){
		 alert("Campo Numero Telefone adicional 3 deve ter somente numeros")
		 frmNovoContato.nome.focus();
		 return false;
	 }else{
		 document.forms["frmNovoContato"].submit();
	 }	 
 }
 
