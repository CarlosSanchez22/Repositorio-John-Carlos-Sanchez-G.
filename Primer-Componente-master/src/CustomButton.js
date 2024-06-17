import React from 'react';

function CustomButton({ text, disabled, onClick }) {
  return (
    <button disabled={disabled} onClick={onClick} style={{ margin: '0 10px', padding: '10px 20px', fontSize: '16px', cursor: disabled ? 'not-allowed' : 'pointer' }}>
      {text}
    </button>
  );
}

export default CustomButton;
