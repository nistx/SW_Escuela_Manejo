function showConfirmation(link) {
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
      Swal.fire(
        "¡Eliminado!",
        "El estudiante ha sido eliminado.",
        "success"
      ).then(() => {
        window.location.href = link;
      });
    }
  });
  return false;
}

function eliminarCurso(link) {
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
      Swal.fire("¡Eliminado!", "El curso ha sido eliminado.", "success").then(
        () => {
          window.location.href = link;
        }
      );
    }
  });
  return false;
}
