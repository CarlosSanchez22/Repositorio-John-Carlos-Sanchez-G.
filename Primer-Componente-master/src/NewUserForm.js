import React from 'react';
import CustomInput from './CustomInput';
import CustomButton from './CustomButton';

function NewUserForm() {
  return (
    <div style={{ backgroundColor: '#000', color: '#fff', padding: '20px', width: '300px', margin: 'auto', textAlign: 'left' }}>
      <h2>Nuevo Usuario</h2>
      <CustomInput label={"Usuario"} disabled={false} />
      <CustomInput label={"Correo"} disabled={false} type="email" />
      <CustomInput label={"Contraseña"} disabled={false} type="password" />
      <div style={{ margin: '10px 0' }}>
        <input type="checkbox" id="terms" name="terms" />
        <label htmlFor="terms"> Acepto términos y condiciones.</label>
      </div>
      <div>
        <CustomButton text="Cancelar" disabled={false} onClick={() => alert('Cancelado')} />
        <CustomButton text="Aceptar" disabled={false} onClick={() => alert('Aceptado')} />
      </div>
    </div>
  );
}

export default NewUserForm;
