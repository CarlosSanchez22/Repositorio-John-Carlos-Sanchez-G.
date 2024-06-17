function CustomInput({ label, disabled, type = 'text' }) {
  return (
    <>
      <label>{label}</label>
      <input type={type} disabled={disabled} style={{ display: 'block', margin: '10px 0', padding: '8px', width: '200px' }} />
    </>
  );
}

export default CustomInput;
