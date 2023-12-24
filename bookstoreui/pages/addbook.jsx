
import { useState } from 'react';

function Addbook() {
    const [book, setBook] = useState({ title: '', author: '', isbn: '' });


    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            const response = await fetch('http://localhost:8080/api/books', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(book),
            });
            if (!response.ok) {
                throw new Error(`Error: ${response.status}`);
            }
            alert('Book added successfully!');
            setBook({ title: '', author: '', isbn: '' }); // Reset form
        } catch (error) {
            console.error('Failed to add book:', error);
        }
    };

    const handleChange = (event) => {
        setBook({ ...book, [event.target.name]: event.target.value });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input
                type="text"
                name="title"
                value={book.title}
                onChange={handleChange}
                placeholder="Title"
                required
            />
            <input
                type="text"
                name="author"
                value={book.author}
                onChange={handleChange}
                placeholder="Author"
                required
            />
            <input
                type="text"
                name="isbn"
                value={book.isbn}
                onChange={handleChange}
                placeholder="ISBN"
                required
            />
            <button type="submit">Add Book</button>
        </form>
    );
}

export default Addbook;
