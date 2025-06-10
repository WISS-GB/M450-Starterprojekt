import ItemRow from "./ItemRow";

function ItemList() {
  return (
    <>
      <h3>Item List</h3>
      <div className="container">
        <ItemRow />
        <ItemRow />
        <ItemRow />
        <ItemRow />
      </div>
    </>
  );
}

export default ItemList;
