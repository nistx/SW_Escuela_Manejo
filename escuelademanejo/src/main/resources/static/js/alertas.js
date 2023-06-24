function showConfirmation(link, mensaje) {
  Swal.fire({
    title: "¿Deseas eliminar?",
    text: "Esta acción no se puede revertir",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Sí, eliminar",
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire("¡Eliminado!", mensaje + " ha sido eliminado.", "success").then(
        () => {
          window.location.href = link;
        }
      );
    }
  });
  return false;
}

function showError() {
  if (resta === 0) {
    Swal.fire({
      icon: "warning",
      title: "No se puede registrar",
      text: "No tiene más clases disponibles",
      confirmButtonText: "OK",
    });
    return false; // Evita que el formulario se envíe
  }
  return true; // Permite que el formulario se envíe si la resta no es cero
}
