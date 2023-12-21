import { useEffect, useState } from 'react';

export default function Books() {
    const [books, setBooks] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/books')
            .then(response => response.json())
            .then(data => setBooks(data))
            .catch(error => console.error('Error:', error));
    }, []);

    return (
        <div>
            <h1>Books</h1>
            <div>
                {books.map(book => (
                    <div key={book.id}>
                        <h2>{book.title}</h2>
                        <p>Author: {book.author}</p>
                        <p>ISBN: {book.isbn}</p>
                    </div>
                ))}
            </div>
        </div>
    );
}
