(function () {
  var listaBotonesEditar = document.querySelectorAll(".editarInstructor");

  listaBotonesEditar.forEach((item) => {
    item.addEventListener("click", (e) => {
      document.getElementById("id").value = item.dataset.id;
      document.getElementById("txtNombre").value = item.dataset.nombre;
      document.getElementById("txtApellido").value = item.dataset.apellido;
      document.getElementById("txtDni").value = item.dataset.dni;
      document.getElementById("txtTelefono").value = item.dataset.telefono;
      document.getElementById("txtDireccion").value = item.dataset.direccion;
      new bootstrap.Modal(document.getElementById("modalInstructor")).show();
    });
  });
})();
