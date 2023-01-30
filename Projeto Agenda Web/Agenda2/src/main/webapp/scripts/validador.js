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
	 }else{
		 document.forms["frmNovoContato"].submit();
	 }	 
 }
 
