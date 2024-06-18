var express = require('express');
var router = express.Router();

// Datos de ejemplo
var users = [
  { id: 1, name: 'John Doe', email: 'john@example.com' },
  { id: 2, name: 'Jane Doe', email: 'jane@example.com' }
];

// GET: Obtener todos los usuarios
router.get('/', function(req, res, next) {
  res.json(users);
});

// GET: Obtener un usuario por ID
router.get('/:id', function(req, res, next) {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).send('User not found');
  res.json(user);
});

// POST: Crear un nuevo usuario
router.post('/', function(req, res, next) {
  const newUser = {
    id: users.length + 1,
    name: req.body.name,
    email: req.body.email
  };
  users.push(newUser);
  res.status(201).json(newUser);
});

// PUT: Actualizar un usuario por ID
router.put('/:id', function(req, res, next) {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).send('User not found');
  
  user.name = req.body.name || user.name;
  user.email = req.body.email || user.email;
  
  res.json(user);
});

// PATCH: Actualizar parcialmente un usuario por ID
router.patch('/:id', function(req, res, next) {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).send('User not found');
  
  if (req.body.name) user.name = req.body.name;
  if (req.body.email) user.email = req.body.email;
  
  res.json(user);
});

// DELETE: Eliminar un usuario por ID
router.delete('/:id', function(req, res, next) {
  const userIndex = users.findIndex(u => u.id === parseInt(req.params.id));
  if (userIndex === -1) return res.status(404).send('User not found');
  
  const deletedUser = users.splice(userIndex, 1);
  res.json(deletedUser);
});

module.exports = router;
